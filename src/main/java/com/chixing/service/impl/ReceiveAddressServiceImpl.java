package com.chixing.service.impl;

import com.chixing.entity.ReceiveAddress;
import com.chixing.mapper.ReceiveAddressMapper;
import com.chixing.service.ReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiveAddressServiceImpl implements ReceiveAddressService {

    @Autowired
    private ReceiveAddressMapper receiveAddressMapper;

    @Override
    public ReceiveAddress queryAddressById(Integer addressId) {
        return receiveAddressMapper.selectByPrimaryKey(addressId);
    }

    @Override
    public List<ReceiveAddress> queryClientAddress(Integer clientId) {
        return receiveAddressMapper.selectClientAddress(clientId);
    }

    @Override
    public ReceiveAddress queryClient2Address(Integer clientId) {
        return receiveAddressMapper.selectClient2Address(clientId);
    }

    @Override
    public Integer queryAddressCounts(Integer clientId) {
        return receiveAddressMapper.selectAddressCounts(clientId);
    }

    @Override
    public Integer modifyAddress(ReceiveAddress receiveAddress) {
        return receiveAddressMapper.updateByPrimaryKey(receiveAddress);
    }

    @Override
    public Integer insertAddress(ReceiveAddress receiveAddress) {
        return receiveAddressMapper.insert(receiveAddress);
    }

    @Override
    public Integer deleteAddress(Integer addressId) {
        return receiveAddressMapper.deleteByPrimaryKey(addressId);
    }



}
