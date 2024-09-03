package com.example.demo.domain.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.domain.models.dto.ContaRequestDto;
import com.example.demo.domain.models.dto.ContaResponseDto;
import com.example.demo.domain.services.interfaces.ContaDomainService;

@Service
public class ContaDomainServiceImpl implements ContaDomainService {

	@Override
	public ContaResponseDto inserir(ContaRequestDto request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContaResponseDto atualizar(UUID id, ContaRequestDto request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContaResponseDto excluir(UUID id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ContaResponseDto> consultar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ContaResponseDto obterPorId(UUID id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
