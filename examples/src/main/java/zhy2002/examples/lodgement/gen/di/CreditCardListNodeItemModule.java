package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@CreditCardListNodeItemScope
public class CreditCardListNodeItemModule {

    String getItemName() {
        return "";
    }

    @Provides
    @CreditCardListNodeItemScope
    CreditCardNode provideCreditCardNode(
        CreditCardListNode parent,
        MembersInjector<CreditCardNode> injector
    ) {
        CreditCardNode node = new CreditCardNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}