package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@MonthYearNodeChildScope
@Subcomponent(modules = {MonthYearNodeChildModule.class})
public interface MonthYearNodeChildComponent {

    MonthNode provideMonthNode(@Named("monthNode") MonthNode impl);
    YearNode provideYearNode(@Named("yearNode") YearNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setMonthYearNodeChildModule(MonthYearNodeChildModule module);

        MonthYearNodeChildComponent build();
    }
}
