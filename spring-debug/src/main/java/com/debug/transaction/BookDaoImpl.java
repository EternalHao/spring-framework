package com.debug.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sky
 * @date 2020/3/30 - 8:15 下午
 */
@Service("bookService")
public class BookServiceImpl implements BookService{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * 查询价格
	 * @param bid
	 */
	@Override
	public Integer queryPrice(String bid) {
		return jdbcTemplate.queryForObject("select price from book where bid = ?", new Object[]{bid}, Integer.class);
	}

	/**
	 * 修改库存
	 * @param bid
	 */
	@Override
	public void updateStock(String bid) {
		Integer st = jdbcTemplate.queryForObject("select count from stock where sid = ?", new Object[]{bid}, Integer.class);
		if(st <= 0){
			throw new RuntimeException("库存不足");
		}else{
			jdbcTemplate.update("update stock set  count = count - 1 where sid = ?",bid);
		}

	}

	/**
	 * 更新余额
	 * @param uid
	 * @param price
	 */
	@Override
	public void updateBalance(String uid, Integer price) {
		Integer balance = jdbcTemplate.queryForObject("select balance from money where uid = ?", new Object[]{uid}, Integer.class);

		if(balance < price){
			throw new RuntimeException("钱不够了");
		}else {
			jdbcTemplate.update("update money set balance = balance - ? where uid = ?",price,uid);
		}
	}

	// 事务注解
	@Transactional
	public void buyBook(){
		String bid = "1";
		String uid = "1001";

		/**
		 * 这三个操作是原子性
		 */
		Integer price = this.queryPrice(bid);
		this.updateSt(bid);
		this.updateBalance(uid,price);

		/**
		 * 第二次 库存减少 ,但是 余额没有变 不符合 事务的特性
		 * 要不都成功 要不都失败
		 */
	}
}
