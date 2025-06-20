package com.example.service;

import java.util.List;

import com.example.entity.Settlement;
import com.example.entity.Settlement;

public interface SettelmentService {

	Settlement createSettelment(Settlement settelment);

	Settlement getSettelmentByclaimId(Long claimId);

	List<Settlement> getAllSettlement();

	void deletSettelment(Long id);

}
