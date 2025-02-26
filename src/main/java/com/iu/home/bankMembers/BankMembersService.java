package com.iu.home.bankMembers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.home.bankMembers.BankMembersDTO;

@Service
public class BankMembersService {

	@Autowired
	private BankMembersDAO bankMembersDAO;

	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO)throws Exception{
		// TODO Auto-generated method stub
		return bankMembersDAO.getLogin(bankMembersDTO);
	}

	public int setJoin(BankMembersDTO bankMembersDTO)throws Exception{

		return bankMembersDAO.setJoin(bankMembersDTO);
	}

	public List<BankMembersDTO> getSearchByID(String search)throws Exception {
		// TODO Auto-generated method stub
		return bankMembersDAO.getSearchByID(search);
	}


}