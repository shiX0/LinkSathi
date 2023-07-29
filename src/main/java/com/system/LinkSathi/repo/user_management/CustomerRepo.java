package com.system.LinkSathi.repo.user_management;

import com.system.LinkSathi.entity.user_management.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
