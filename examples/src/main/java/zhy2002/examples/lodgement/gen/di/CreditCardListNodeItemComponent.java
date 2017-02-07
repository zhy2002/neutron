package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@CreditCardListNodeItemScope
@Subcomponent(modules = {CreditCardListNodeItemModule.class})
public interface CreditCardListNodeItemComponent {

    CreditCardNode provideCreditCardNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setCreditCardListNodeItemModule(CreditCardListNodeItemModule module);

        CreditCardListNodeItemComponent build();
    }
}
