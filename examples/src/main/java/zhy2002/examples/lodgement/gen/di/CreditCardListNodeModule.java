package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CreditCardListNodeModule {

    private final CreditCardListNode owner;

    public CreditCardListNodeModule(CreditCardListNode owner) {
        this.owner = owner;
    }

    @Provides @CreditCardListNodeScope @Owner CreditCardListNode provideCreditCardListNode() {
        return owner;
    }

    @Provides @CreditCardListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @CreditCardListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CreditCardListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}