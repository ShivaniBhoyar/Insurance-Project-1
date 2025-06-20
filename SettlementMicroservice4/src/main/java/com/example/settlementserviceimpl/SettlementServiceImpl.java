package com.example.settlementserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Settlement;
import com.example.service.SettelmentService;
import com.example.settlementrepository.SettlementRepository;


@Service
public class SettlementServiceImpl implements SettelmentService {

	@Autowired
	private SettlementRepository settlementRepository;

	@Override
	public Settlement createSettelment(Settlement settelment) {
		return settlementRepository.save(settelment);

	}

	@Override
	public Settlement getSettelmentByclaimId(Long claimId) {
		
		return settlementRepository.findByClaimId(claimId);
	}

	@Override
	public List<Settlement> getAllSettlement() {
		
		return settlementRepository.findAll();
	}

	@Override
	public void deletSettelment(Long id) {
		settlementRepository.deleteById(id);

	}

}
