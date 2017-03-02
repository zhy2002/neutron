package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@AccountHolderReferenceNodeScope
@Subcomponent(modules = {AccountHolderReferenceNodeModule.class})
public interface AccountHolderReferenceNodeComponent {

    AccountHolderReferenceNodeRuleProvider getAccountHolderReferenceNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAccountHolderReferenceNodeModule(AccountHolderReferenceNodeModule module);

        AccountHolderReferenceNodeComponent build();
    }
}
