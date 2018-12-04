package com.chixing.service;

import com.chixing.entity.ReceiveAddress;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReceiveAddressService {

    ReceiveAddress queryAddressById(Integer addressId);


    List<ReceiveAddress> queryClientAddress(Integer clientId);

    ReceiveAddress queryClient2Address(Integer clientId);

    Integer queryAddressCounts(Integer clientId);

    Integer modifyAddress(ReceiveAddress receiveAddress);

    Integer insertAddress(ReceiveAddress receiveAddress);

    //删除地址
    Integer deleteAddress(Integer addressId);

}
