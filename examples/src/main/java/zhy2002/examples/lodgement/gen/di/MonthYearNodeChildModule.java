package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@MonthYearNodeChildScope
public class MonthYearNodeChildModule {


    @Provides
    @MonthYearNodeChildScope
    @Named("monthNode")
    MonthNode provideMonthNode(
        MonthYearNode parent,
        MembersInjector<MonthNode> injector
    ) {
        MonthNode node = new MonthNode(parent, "monthNode");

        injector.injectMembers(node);
        return node;
    }

    @Provides
    @MonthYearNodeChildScope
    @Named("yearNode")
    YearNode provideYearNode(
        MonthYearNode parent,
        MembersInjector<YearNode> injector
    ) {
        YearNode node = new YearNode(parent, "yearNode");

        injector.injectMembers(node);
        return node;
    }

}