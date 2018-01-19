package com.accenture.ia.dto;

import java.io.Serializable;

import com.accenture.ia.dto.OutputDto.OutputDtoBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OutputResultDto implements Serializable {
	Boolean updated;
}
