package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@LegalActionNodeScope
@Subcomponent(modules = {LegalActionNodeModule.class})
public interface LegalActionNodeComponent {

    LegalActionNodeRuleProvider getLegalActionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setLegalActionNodeModule(LegalActionNodeModule module);

        LegalActionNodeComponent build();
    }
}
