package com.hitoshi.agendadortarefas.business.mapper;


import com.hitoshi.agendadortarefas.business.dto.TarefasDTO;
import com.hitoshi.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
