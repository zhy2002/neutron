package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@RelatedPersonReferenceNodeScope
@Subcomponent(modules = {RelatedPersonReferenceNodeModule.class})
public interface RelatedPersonReferenceNodeComponent {

    RelatedPersonReferenceNodeRuleProvider getRelatedPersonReferenceNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setRelatedPersonReferenceNodeModule(RelatedPersonReferenceNodeModule module);

        RelatedPersonReferenceNodeComponent build();
    }
}
