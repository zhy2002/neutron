package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    CreditCardNodeChildComponent.class
})
@CreditCardListNodeItemScope
public class CreditCardListNodeItemModule {

    private final CreditCardListNode parent;

    public CreditCardListNodeItemModule(CreditCardListNode parent) {
        this.parent = parent;
    }

    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }

    @Provides
    @CreditCardListNodeItemScope
    CreditCardNode provideCreditCardNode(
        MembersInjector<CreditCardNode> injector
    ) {
        CreditCardNode node = new CreditCardNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}