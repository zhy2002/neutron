package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@FinancialPositionNodeChildScope
@Subcomponent(modules = {FinancialPositionNodeChildModule.class})
public interface FinancialPositionNodeChildComponent {

    AssetsNode provideAssetsNode(@Named("assetsNode") AssetsNode impl);
    LiabilitiesNode provideLiabilitiesNode(@Named("liabilitiesNode") LiabilitiesNode impl);
    ExpensesNode provideExpensesNode(@Named("expensesNode") ExpensesNode impl);

}
