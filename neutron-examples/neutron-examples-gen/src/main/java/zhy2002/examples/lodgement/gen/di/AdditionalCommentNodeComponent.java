package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@AdditionalCommentNodeScope
@Subcomponent(modules = {AdditionalCommentNodeModule.class})
public interface AdditionalCommentNodeComponent {

    AdditionalCommentNodeRuleProvider getAdditionalCommentNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAdditionalCommentNodeModule(AdditionalCommentNodeModule module);

        AdditionalCommentNodeComponent build();
    }
}
