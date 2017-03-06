package ${targetPackage}.gen.di;
import dagger.Subcomponent;
import ${targetPackage}.gen.*;
import ${targetPackage}.gen.node.*;

@${typeName}Scope
@Subcomponent(modules = {${typeName}Module.class})
public interface ${typeName}Component {

    ${typeName}RuleProvider get${typeName}RuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder set${typeName}Module(${typeName}Module module);

        ${typeName}Component build();
    }
}
