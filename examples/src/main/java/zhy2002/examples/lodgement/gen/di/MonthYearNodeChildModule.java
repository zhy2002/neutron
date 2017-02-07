package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@MonthYearNodeChildScope
public class MonthYearNodeChildModule {

    private final MonthYearNode parent;

    public MonthYearNodeChildModule(MonthYearNode parent) {
        this.parent = parent;
    }


    @Provides
    @MonthYearNodeChildScope
    @Named("monthNode")
    MonthNode provideMonthNode(
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
        MembersInjector<YearNode> injector
    ) {
        YearNode node = new YearNode(parent, "yearNode");

        injector.injectMembers(node);
        return node;
    }

}