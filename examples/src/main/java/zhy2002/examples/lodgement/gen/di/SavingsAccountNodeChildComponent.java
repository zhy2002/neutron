package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@SavingsAccountNodeChildScope
@Subcomponent(modules = {SavingsAccountNodeChildModule.class})
public interface SavingsAccountNodeChildComponent {

    SavingsTypeNode provideSavingsTypeNode(@Named("savingsTypeNode") SavingsTypeNode impl);
    SavingsInstitutionNameNode provideSavingsInstitutionNameNode(@Named("savingsInstitutionNameNode") SavingsInstitutionNameNode impl);
    SavingsBalanceNode provideSavingsBalanceNode(@Named("savingsBalanceNode") SavingsBalanceNode impl);
    SavingsBsbNoNode provideSavingsBsbNoNode(@Named("savingsBsbNoNode") SavingsBsbNoNode impl);
    SavingsAccountNoNode provideSavingsAccountNoNode(@Named("savingsAccountNoNode") SavingsAccountNoNode impl);
    SavingsAccountNameNode provideSavingsAccountNameNode(@Named("savingsAccountNameNode") SavingsAccountNameNode impl);

}
