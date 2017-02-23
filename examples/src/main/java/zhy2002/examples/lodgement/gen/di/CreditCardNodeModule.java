package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CreditCardNodeModule {

    private final CreditCardNode owner;

    public CreditCardNodeModule(CreditCardNode owner) {
        this.owner = owner;
    }

    @Provides @CreditCardNodeScope @Owner CreditCardNode provideCreditCardNode() {
        return owner;
    }

    @Provides @CreditCardNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @CreditCardNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}