package com.accenture.ia.dto;

import java.io.Serializable;

import com.accenture.ia.dto.InputDto.InputDtoBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OutputDto implements Serializable {
	/** label: >50K, <=50K. */
	String label;
}
