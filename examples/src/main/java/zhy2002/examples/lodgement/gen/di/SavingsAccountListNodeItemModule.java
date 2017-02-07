package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@SavingsAccountListNodeItemScope
public class SavingsAccountListNodeItemModule {

    String getItemName() {
        return "";
    }

    @Provides
    @SavingsAccountListNodeItemScope
    SavingsAccountNode provideSavingsAccountNode(
        SavingsAccountListNode parent,
        MembersInjector<SavingsAccountNode> injector
    ) {
        SavingsAccountNode node = new SavingsAccountNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}