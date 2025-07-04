package com.example.settlementrepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Settlement;
@Repository
public interface SettlementRepository extends JpaRepository<Settlement, Long> {
	Settlement findByClaimId(Long claimId);

}
