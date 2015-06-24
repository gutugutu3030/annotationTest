package test.processor;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

import test.Test1;

@SupportedSourceVersion(SourceVersion.RELEASE_7)
@SupportedAnnotationTypes("test.*")
public class TestProcessor extends AbstractProcessor {

	@Override
	public boolean process(Set<? extends TypeElement> annotations,
			RoundEnvironment roundEnv) {
		if(annotations.isEmpty()){
			System.out.println("アノテーションないぜ！");
			return true;
		}
		System.out.println("アノテーション発見！");
		System.out.println("annotations");
		for(TypeElement typeElement:annotations){
			System.out.println("名前："+typeElement.getSimpleName().toString());
		}
		System.out.println("roundEnv of Test1");
		Set<? extends Element> e_set=roundEnv.getElementsAnnotatedWith(Test1.class);
		for(Element element:e_set){
			System.out.println("toString："+element.toString());
		}




		// TODO 自動生成されたメソッド・スタブ
		return false;
	}
}
