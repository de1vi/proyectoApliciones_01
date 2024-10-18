package com.api.api.repository;

import com.api.api.model.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleRepository extends JpaRepository<DetalleOrden,Integer> {
}
