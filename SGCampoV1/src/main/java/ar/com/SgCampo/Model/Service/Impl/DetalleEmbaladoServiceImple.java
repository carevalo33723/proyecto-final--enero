package ar.com.SgCampo.Model.Service.Impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.SgCampo.Model.Entity.DetalleCosecha;
import ar.com.SgCampo.Model.Entity.DetalleEmbalado;
import ar.com.SgCampo.Model.Entity.Embalado;
import ar.com.SgCampo.Model.Repository.ICosecha;
import ar.com.SgCampo.Model.Repository.IDetalleCosecha;
import ar.com.SgCampo.Model.Repository.IDetalleEmbalado;
import ar.com.SgCampo.Model.Repository.IEmbalado;
import ar.com.SgCampo.Model.Serivice.IDetalleCosechaService;
import ar.com.SgCampo.Model.Serivice.IDetalleEmbaladoService;


@Service
public class DetalleEmbaladoServiceImple implements IDetalleEmbaladoService{

	@Autowired
	IEmbalado embale;
	
	@Autowired
	IDetalleCosecha detCos;
	
	@Autowired
	IDetalleEmbalado detEmb;
	
	@Override
	public void guardarConDetalles(String nota, List<Integer> detalleIds, List<Integer> cantidades) {
		
        Embalado embalado = new Embalado();
        embalado.setFecha(LocalDate.now());;
        embalado.setNota(nota);
        

        embalado = embale.save(embalado);

        for (int i = 0; i < detalleIds.size(); i++) {
            DetalleCosecha detalleCosecha = detCos.findById(detalleIds.get(i));
            DetalleEmbalado detalleEmbalado = new DetalleEmbalado();

            detalleEmbalado.setEmbalado(embalado);
            detalleEmbalado.setDetalleCosecha(detalleCosecha);
            detalleEmbalado.setCantidadCosechada(detalleCosecha.getCantidad());
            detalleEmbalado.setCantidadEmbalada(cantidades.get(i));
            

            detEmb.save(detalleEmbalado);
        }
    }
		
	}

	

	

