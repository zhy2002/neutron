package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@SavingsAccountNodeChildScope
public class SavingsAccountNodeChildModule {


    @Provides
    @SavingsAccountNodeChildScope
    @Named("savingsTypeNode")
    SavingsTypeNode provideSavingsTypeNode(
        SavingsAccountNode parent,
        MembersInjector<SavingsTypeNode> injector
    ) {
        SavingsTypeNode node = new SavingsTypeNode(parent, "savingsTypeNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @SavingsAccountNodeChildScope
    @Named("savingsInstitutionNameNode")
    SavingsInstitutionNameNode provideSavingsInstitutionNameNode(
        SavingsAccountNode parent,
        MembersInjector<SavingsInstitutionNameNode> injector
    ) {
        SavingsInstitutionNameNode node = new SavingsInstitutionNameNode(parent, "savingsInstitutionNameNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @SavingsAccountNodeChildScope
    @Named("savingsBalanceNode")
    SavingsBalanceNode provideSavingsBalanceNode(
        SavingsAccountNode parent,
        MembersInjector<SavingsBalanceNode> injector
    ) {
        SavingsBalanceNode node = new SavingsBalanceNode(parent, "savingsBalanceNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @SavingsAccountNodeChildScope
    @Named("savingsBsbNoNode")
    SavingsBsbNoNode provideSavingsBsbNoNode(
        SavingsAccountNode parent,
        MembersInjector<SavingsBsbNoNode> injector
    ) {
        SavingsBsbNoNode node = new SavingsBsbNoNode(parent, "savingsBsbNoNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @SavingsAccountNodeChildScope
    @Named("savingsAccountNoNode")
    SavingsAccountNoNode provideSavingsAccountNoNode(
        SavingsAccountNode parent,
        MembersInjector<SavingsAccountNoNode> injector
    ) {
        SavingsAccountNoNode node = new SavingsAccountNoNode(parent, "savingsAccountNoNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @SavingsAccountNodeChildScope
    @Named("savingsAccountNameNode")
    SavingsAccountNameNode provideSavingsAccountNameNode(
        SavingsAccountNode parent,
        MembersInjector<SavingsAccountNameNode> injector
    ) {
        SavingsAccountNameNode node = new SavingsAccountNameNode(parent, "savingsAccountNameNode");

        injector.injectMembers(node);
        return node;
    }

}