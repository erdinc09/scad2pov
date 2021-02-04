/*
 * generated by Xtext 2.24.0
 */
package com.karalisoft.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.karalisoft.ide.contentassist.antlr.internal.InternalScadParser;
import com.karalisoft.services.ScadGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ScadParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ScadGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ScadGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getModelAccess().getBlocksAlternatives_0(), "rule__Model__BlocksAlternatives_0");
			builder.put(grammarAccess.getModuleOrFunctionAccess().getAlternatives(), "rule__ModuleOrFunction__Alternatives");
			builder.put(grammarAccess.getUseOrIncludeAccess().getAlternatives_1(), "rule__UseOrInclude__Alternatives_1");
			builder.put(grammarAccess.getModuleAccess().getBlocksAlternatives_5_1_0(), "rule__Module__BlocksAlternatives_5_1_0");
			builder.put(grammarAccess.getTransformationAccess().getAlternatives(), "rule__Transformation__Alternatives");
			builder.put(grammarAccess.getScaleAccess().getAlternatives_1_2(), "rule__Scale__Alternatives_1_2");
			builder.put(grammarAccess.getShapeAccess().getImplAlternatives_1_0(), "rule__Shape__ImplAlternatives_1_0");
			builder.put(grammarAccess.getTransformedShapeAccess().getTranslationsAlternatives_1_0(), "rule__TransformedShape__TranslationsAlternatives_1_0");
			builder.put(grammarAccess.getTransformedModuleOrFunctionCallAccess().getTranslationsAlternatives_1_0(), "rule__TransformedModuleOrFunctionCall__TranslationsAlternatives_1_0");
			builder.put(grammarAccess.getSphereParamsAccess().getAlternatives_1(), "rule__SphereParams__Alternatives_1");
			builder.put(grammarAccess.getCylinderParamsAccess().getAlternatives_1(), "rule__CylinderParams__Alternatives_1");
			builder.put(grammarAccess.getCylinderParamsAccess().getCenterAlternatives_1_10_1_0(), "rule__CylinderParams__CenterAlternatives_1_10_1_0");
			builder.put(grammarAccess.getCubeParamsAccess().getAlternatives_1(), "rule__CubeParams__Alternatives_1");
			builder.put(grammarAccess.getCubeParamsAccess().getAlternatives_1_0_1(), "rule__CubeParams__Alternatives_1_0_1");
			builder.put(grammarAccess.getCubeParamsAccess().getCenterAlternatives_1_1_1_0(), "rule__CubeParams__CenterAlternatives_1_1_1_0");
			builder.put(grammarAccess.getUnionAccess().getShapesAlternatives_1_4_0(), "rule__Union__ShapesAlternatives_1_4_0");
			builder.put(grammarAccess.getIntersectionAccess().getShapesAlternatives_1_4_0(), "rule__Intersection__ShapesAlternatives_1_4_0");
			builder.put(grammarAccess.getDifferenceAccess().getShapesAlternatives_1_4_0(), "rule__Difference__ShapesAlternatives_1_4_0");
			builder.put(grammarAccess.getDoubleAccess().getAlternatives_0(), "rule__Double__Alternatives_0");
			builder.put(grammarAccess.getUseOrIncludeAccess().getGroup(), "rule__UseOrInclude__Group__0");
			builder.put(grammarAccess.getModuleAccess().getGroup(), "rule__Module__Group__0");
			builder.put(grammarAccess.getModuleAccess().getGroup_5(), "rule__Module__Group_5__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getModuleOrFunctionCallAccess().getGroup(), "rule__ModuleOrFunctionCall__Group__0");
			builder.put(grammarAccess.getTranslateAccess().getGroup(), "rule__Translate__Group__0");
			builder.put(grammarAccess.getTranslateAccess().getGroup_1(), "rule__Translate__Group_1__0");
			builder.put(grammarAccess.getRotateAccess().getGroup(), "rule__Rotate__Group__0");
			builder.put(grammarAccess.getRotateAccess().getGroup_1(), "rule__Rotate__Group_1__0");
			builder.put(grammarAccess.getScaleAccess().getGroup(), "rule__Scale__Group__0");
			builder.put(grammarAccess.getScaleAccess().getGroup_1(), "rule__Scale__Group_1__0");
			builder.put(grammarAccess.getScaleAccess().getGroup_1_2_0(), "rule__Scale__Group_1_2_0__0");
			builder.put(grammarAccess.getShapeAccess().getGroup(), "rule__Shape__Group__0");
			builder.put(grammarAccess.getTransformedShapeAccess().getGroup(), "rule__TransformedShape__Group__0");
			builder.put(grammarAccess.getTransformedModuleOrFunctionCallAccess().getGroup(), "rule__TransformedModuleOrFunctionCall__Group__0");
			builder.put(grammarAccess.getSphereAccess().getGroup(), "rule__Sphere__Group__0");
			builder.put(grammarAccess.getSphereAccess().getGroup_1(), "rule__Sphere__Group_1__0");
			builder.put(grammarAccess.getSphereAccess().getGroup_1_2(), "rule__Sphere__Group_1_2__0");
			builder.put(grammarAccess.getSphereAccess().getGroup_1_2_1(), "rule__Sphere__Group_1_2_1__0");
			builder.put(grammarAccess.getSphereParamsAccess().getGroup(), "rule__SphereParams__Group__0");
			builder.put(grammarAccess.getSphereParamsAccess().getGroup_1_0(), "rule__SphereParams__Group_1_0__0");
			builder.put(grammarAccess.getSphereParamsAccess().getGroup_1_1(), "rule__SphereParams__Group_1_1__0");
			builder.put(grammarAccess.getSphereParamsAccess().getGroup_1_2(), "rule__SphereParams__Group_1_2__0");
			builder.put(grammarAccess.getSphereParamsAccess().getGroup_1_3(), "rule__SphereParams__Group_1_3__0");
			builder.put(grammarAccess.getSphereParamsAccess().getGroup_1_4(), "rule__SphereParams__Group_1_4__0");
			builder.put(grammarAccess.getCylinderAccess().getGroup(), "rule__Cylinder__Group__0");
			builder.put(grammarAccess.getCylinderAccess().getGroup_1(), "rule__Cylinder__Group_1__0");
			builder.put(grammarAccess.getCylinderAccess().getGroup_1_2(), "rule__Cylinder__Group_1_2__0");
			builder.put(grammarAccess.getCylinderAccess().getGroup_1_2_1(), "rule__Cylinder__Group_1_2_1__0");
			builder.put(grammarAccess.getCylinderParamsAccess().getGroup(), "rule__CylinderParams__Group__0");
			builder.put(grammarAccess.getCylinderParamsAccess().getGroup_1_0(), "rule__CylinderParams__Group_1_0__0");
			builder.put(grammarAccess.getCylinderParamsAccess().getGroup_1_1(), "rule__CylinderParams__Group_1_1__0");
			builder.put(grammarAccess.getCylinderParamsAccess().getGroup_1_2(), "rule__CylinderParams__Group_1_2__0");
			builder.put(grammarAccess.getCylinderParamsAccess().getGroup_1_3(), "rule__CylinderParams__Group_1_3__0");
			builder.put(grammarAccess.getCylinderParamsAccess().getGroup_1_4(), "rule__CylinderParams__Group_1_4__0");
			builder.put(grammarAccess.getCylinderParamsAccess().getGroup_1_5(), "rule__CylinderParams__Group_1_5__0");
			builder.put(grammarAccess.getCylinderParamsAccess().getGroup_1_6(), "rule__CylinderParams__Group_1_6__0");
			builder.put(grammarAccess.getCylinderParamsAccess().getGroup_1_7(), "rule__CylinderParams__Group_1_7__0");
			builder.put(grammarAccess.getCylinderParamsAccess().getGroup_1_8(), "rule__CylinderParams__Group_1_8__0");
			builder.put(grammarAccess.getCylinderParamsAccess().getGroup_1_9(), "rule__CylinderParams__Group_1_9__0");
			builder.put(grammarAccess.getCylinderParamsAccess().getGroup_1_10(), "rule__CylinderParams__Group_1_10__0");
			builder.put(grammarAccess.getCylinderParamsAccess().getGroup_1_10_0(), "rule__CylinderParams__Group_1_10_0__0");
			builder.put(grammarAccess.getCubeAccess().getGroup(), "rule__Cube__Group__0");
			builder.put(grammarAccess.getCubeAccess().getGroup_1(), "rule__Cube__Group_1__0");
			builder.put(grammarAccess.getCubeAccess().getGroup_1_2(), "rule__Cube__Group_1_2__0");
			builder.put(grammarAccess.getCubeAccess().getGroup_1_2_1(), "rule__Cube__Group_1_2_1__0");
			builder.put(grammarAccess.getCubeParamsAccess().getGroup(), "rule__CubeParams__Group__0");
			builder.put(grammarAccess.getCubeParamsAccess().getGroup_1_0(), "rule__CubeParams__Group_1_0__0");
			builder.put(grammarAccess.getCubeParamsAccess().getGroup_1_0_0(), "rule__CubeParams__Group_1_0_0__0");
			builder.put(grammarAccess.getCubeParamsAccess().getGroup_1_0_1_1(), "rule__CubeParams__Group_1_0_1_1__0");
			builder.put(grammarAccess.getCubeParamsAccess().getGroup_1_1(), "rule__CubeParams__Group_1_1__0");
			builder.put(grammarAccess.getCubeParamsAccess().getGroup_1_1_0(), "rule__CubeParams__Group_1_1_0__0");
			builder.put(grammarAccess.getUnionAccess().getGroup(), "rule__Union__Group__0");
			builder.put(grammarAccess.getUnionAccess().getGroup_1(), "rule__Union__Group_1__0");
			builder.put(grammarAccess.getIntersectionAccess().getGroup(), "rule__Intersection__Group__0");
			builder.put(grammarAccess.getIntersectionAccess().getGroup_1(), "rule__Intersection__Group_1__0");
			builder.put(grammarAccess.getDifferenceAccess().getGroup(), "rule__Difference__Group__0");
			builder.put(grammarAccess.getDifferenceAccess().getGroup_1(), "rule__Difference__Group_1__0");
			builder.put(grammarAccess.getDoubleAccess().getGroup(), "rule__Double__Group__0");
			builder.put(grammarAccess.getDoubleAccess().getGroup_1(), "rule__Double__Group_1__0");
			builder.put(grammarAccess.getDoubleAccess().getGroup_1_1(), "rule__Double__Group_1_1__0");
			builder.put(grammarAccess.getModelAccess().getBlocksAssignment(), "rule__Model__BlocksAssignment");
			builder.put(grammarAccess.getModuleAccess().getNameAssignment_2(), "rule__Module__NameAssignment_2");
			builder.put(grammarAccess.getModuleAccess().getBlocksAssignment_5_1(), "rule__Module__BlocksAssignment_5_1");
			builder.put(grammarAccess.getFunctionAccess().getNameAssignment_2(), "rule__Function__NameAssignment_2");
			builder.put(grammarAccess.getModuleOrFunctionCallAccess().getNameAssignment_0(), "rule__ModuleOrFunctionCall__NameAssignment_0");
			builder.put(grammarAccess.getTranslateAccess().getXAssignment_1_3(), "rule__Translate__XAssignment_1_3");
			builder.put(grammarAccess.getTranslateAccess().getYAssignment_1_5(), "rule__Translate__YAssignment_1_5");
			builder.put(grammarAccess.getTranslateAccess().getZAssignment_1_7(), "rule__Translate__ZAssignment_1_7");
			builder.put(grammarAccess.getRotateAccess().getXAssignment_1_3(), "rule__Rotate__XAssignment_1_3");
			builder.put(grammarAccess.getRotateAccess().getYAssignment_1_5(), "rule__Rotate__YAssignment_1_5");
			builder.put(grammarAccess.getRotateAccess().getZAssignment_1_7(), "rule__Rotate__ZAssignment_1_7");
			builder.put(grammarAccess.getScaleAccess().getXAssignment_1_2_0_1(), "rule__Scale__XAssignment_1_2_0_1");
			builder.put(grammarAccess.getScaleAccess().getYAssignment_1_2_0_3(), "rule__Scale__YAssignment_1_2_0_3");
			builder.put(grammarAccess.getScaleAccess().getZAssignment_1_2_0_5(), "rule__Scale__ZAssignment_1_2_0_5");
			builder.put(grammarAccess.getScaleAccess().getScaleAssignment_1_2_1(), "rule__Scale__ScaleAssignment_1_2_1");
			builder.put(grammarAccess.getShapeAccess().getImplAssignment_1(), "rule__Shape__ImplAssignment_1");
			builder.put(grammarAccess.getTransformedShapeAccess().getTranslationsAssignment_1(), "rule__TransformedShape__TranslationsAssignment_1");
			builder.put(grammarAccess.getTransformedShapeAccess().getImplAssignment_3(), "rule__TransformedShape__ImplAssignment_3");
			builder.put(grammarAccess.getTransformedModuleOrFunctionCallAccess().getTranslationsAssignment_1(), "rule__TransformedModuleOrFunctionCall__TranslationsAssignment_1");
			builder.put(grammarAccess.getTransformedModuleOrFunctionCallAccess().getImplAssignment_3(), "rule__TransformedModuleOrFunctionCall__ImplAssignment_3");
			builder.put(grammarAccess.getSphereAccess().getSphereParamsAssignment_1_2_0(), "rule__Sphere__SphereParamsAssignment_1_2_0");
			builder.put(grammarAccess.getSphereAccess().getSphereParamsAssignment_1_2_1_1(), "rule__Sphere__SphereParamsAssignment_1_2_1_1");
			builder.put(grammarAccess.getSphereParamsAccess().getFnAssignment_1_0_2(), "rule__SphereParams__FnAssignment_1_0_2");
			builder.put(grammarAccess.getSphereParamsAccess().getFaAssignment_1_1_2(), "rule__SphereParams__FaAssignment_1_1_2");
			builder.put(grammarAccess.getSphereParamsAccess().getFsAssignment_1_2_2(), "rule__SphereParams__FsAssignment_1_2_2");
			builder.put(grammarAccess.getSphereParamsAccess().getRAssignment_1_3_2(), "rule__SphereParams__RAssignment_1_3_2");
			builder.put(grammarAccess.getSphereParamsAccess().getDAssignment_1_4_2(), "rule__SphereParams__DAssignment_1_4_2");
			builder.put(grammarAccess.getCylinderAccess().getCylinderParamsAssignment_1_2_0(), "rule__Cylinder__CylinderParamsAssignment_1_2_0");
			builder.put(grammarAccess.getCylinderAccess().getCylinderParamsAssignment_1_2_1_1(), "rule__Cylinder__CylinderParamsAssignment_1_2_1_1");
			builder.put(grammarAccess.getCylinderParamsAccess().getFnAssignment_1_0_2(), "rule__CylinderParams__FnAssignment_1_0_2");
			builder.put(grammarAccess.getCylinderParamsAccess().getFaAssignment_1_1_2(), "rule__CylinderParams__FaAssignment_1_1_2");
			builder.put(grammarAccess.getCylinderParamsAccess().getFsAssignment_1_2_2(), "rule__CylinderParams__FsAssignment_1_2_2");
			builder.put(grammarAccess.getCylinderParamsAccess().getHAssignment_1_3_2(), "rule__CylinderParams__HAssignment_1_3_2");
			builder.put(grammarAccess.getCylinderParamsAccess().getRAssignment_1_4_2(), "rule__CylinderParams__RAssignment_1_4_2");
			builder.put(grammarAccess.getCylinderParamsAccess().getR1Assignment_1_5_2(), "rule__CylinderParams__R1Assignment_1_5_2");
			builder.put(grammarAccess.getCylinderParamsAccess().getR2Assignment_1_6_2(), "rule__CylinderParams__R2Assignment_1_6_2");
			builder.put(grammarAccess.getCylinderParamsAccess().getDAssignment_1_7_2(), "rule__CylinderParams__DAssignment_1_7_2");
			builder.put(grammarAccess.getCylinderParamsAccess().getD1Assignment_1_8_2(), "rule__CylinderParams__D1Assignment_1_8_2");
			builder.put(grammarAccess.getCylinderParamsAccess().getD2Assignment_1_9_2(), "rule__CylinderParams__D2Assignment_1_9_2");
			builder.put(grammarAccess.getCylinderParamsAccess().getCenterAssignment_1_10_1(), "rule__CylinderParams__CenterAssignment_1_10_1");
			builder.put(grammarAccess.getCubeAccess().getCubeParamsAssignment_1_2_0(), "rule__Cube__CubeParamsAssignment_1_2_0");
			builder.put(grammarAccess.getCubeAccess().getCubeParamsAssignment_1_2_1_1(), "rule__Cube__CubeParamsAssignment_1_2_1_1");
			builder.put(grammarAccess.getCubeParamsAccess().getSizeAssignment_1_0_1_0(), "rule__CubeParams__SizeAssignment_1_0_1_0");
			builder.put(grammarAccess.getCubeParamsAccess().getXAssignment_1_0_1_1_1(), "rule__CubeParams__XAssignment_1_0_1_1_1");
			builder.put(grammarAccess.getCubeParamsAccess().getYAssignment_1_0_1_1_3(), "rule__CubeParams__YAssignment_1_0_1_1_3");
			builder.put(grammarAccess.getCubeParamsAccess().getZAssignment_1_0_1_1_5(), "rule__CubeParams__ZAssignment_1_0_1_1_5");
			builder.put(grammarAccess.getCubeParamsAccess().getCenterAssignment_1_1_1(), "rule__CubeParams__CenterAssignment_1_1_1");
			builder.put(grammarAccess.getUnionAccess().getShapesAssignment_1_4(), "rule__Union__ShapesAssignment_1_4");
			builder.put(grammarAccess.getIntersectionAccess().getShapesAssignment_1_4(), "rule__Intersection__ShapesAssignment_1_4");
			builder.put(grammarAccess.getDifferenceAccess().getShapesAssignment_1_4(), "rule__Difference__ShapesAssignment_1_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ScadGrammarAccess grammarAccess;

	@Override
	protected InternalScadParser createParser() {
		InternalScadParser result = new InternalScadParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ScadGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ScadGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
