package com.accenture.ia.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InputDto implements Serializable {

	/** _c1 - Age: continuous*/
	Double age;
	/** _c2 - Workclass: Private, Self-emp-not-inc, Self-emp-inc, Federal-gov, Local-gov, State-gov, Without-pay, Never-worked */
	String workclass;
	/** _c3 - Sampling weight: continuous */
	Double fnlwgt;
	/** _c4 - education: Bachelors, Some-college, 11th, HS-grad, Prof-school, Assoc-acdm, Assoc-voc, 9th, 7th-8th, 12th, Masters, 1st-4th, 10th, Doctorate, 5th-6th, Preschool */
	String education;
	/** _c5 - education-num: continuous */
	String educationNum;
	/** _c6 - occupation: Tech-support, Craft-repair, Other-service, Sales, Exec-managerial, Prof-specialty, Handlers-cleaners, Machine-op-inspct, Adm-clerical, Farming-fishing, Transport-moving, Priv-house-serv, Protective-serv, Armed-Forces.*/
	String occupation;
	/** _c7 - relationship: Wife, Own-child, Husband, Not-in-family, Other-relative, Unmarried. */
	String relationship;
	/** _c8 - race: White, Asian-Pac-Islander, Amer-Indian-Eskimo, Other, Black. */
	String race;
	/** _c9 - sex: Female, Male. */
	String sex;
	/** _c10 - capital-gain: continuous. */
	Double capitalGain;
	/** _c11 - capital-loss: continuous. */
	Double capitalLoss;
	/** _c12 - hours-per-week: continuous. */
	Double hoursPerWeek;
	/** _c13 - native-country: United-States, Cambodia, England, Puerto-Rico, Canada, Germany, Outlying-US(Guam-USVI-etc), India, Japan, Greece, South, China, Cuba, Iran, Honduras, Philippines, Italy, Poland, Jamaica, Vietnam, Mexico, Portugal, Ireland, France, Dominican-Republic, Laos, Ecuador, Taiwan, Haiti, Columbia, Hungary, Guatemala, Nicaragua, Scotland, Thailand, Yugoslavia, El-Salvador, Trinadad&Tobago, Peru, Hong, Holand-Netherlands.*/
	String nativeCountry;
}