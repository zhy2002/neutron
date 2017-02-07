package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@SavingsAccountListNodeItemScope
@Subcomponent(modules = {SavingsAccountListNodeItemModule.class})
public interface SavingsAccountListNodeItemComponent {

    SavingsAccountNode provideSavingsAccountNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsAccountListNodeItemModule(SavingsAccountListNodeItemModule module);

        SavingsAccountListNodeItemComponent build();
    }
}
