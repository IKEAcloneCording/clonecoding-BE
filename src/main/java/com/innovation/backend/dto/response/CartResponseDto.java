package com.innovation.backend.dto.response;

import com.innovation.backend.entity.Cart;
import com.innovation.backend.entity.Product;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class CartResponseDto {

  //product response 바꿔주기
//  private MemberResponseDto member;
  private  Product product;
  private Long cart_id;
  private  int count;
  private  BigDecimal sum;
  private  BigDecimal delivery_fee;

  private LocalDateTime createdAt;

  public CartResponseDto (Cart cart){
    this.cart_id = cart.getId();
    this.product = cart.getProduct();
    this.count = cart.getCount();
    this.sum = cart.getSum();
    this.delivery_fee = new BigDecimal(count * 15000 );
    this.createdAt = cart.getCreatedAt();

  }

}
