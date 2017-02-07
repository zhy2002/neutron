package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@LoanListNodeItemScope
@Subcomponent(modules = {LoanListNodeItemModule.class})
public interface LoanListNodeItemComponent {

    LoanNode provideLoanNode();

}
