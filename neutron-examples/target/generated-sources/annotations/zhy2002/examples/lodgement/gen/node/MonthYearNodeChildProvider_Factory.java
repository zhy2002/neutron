package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MonthYearNodeChildProvider_Factory
    implements Factory<MonthYearNodeChildProvider> {
  private final MembersInjector<MonthYearNodeChildProvider>
      monthYearNodeChildProviderMembersInjector;

  public MonthYearNodeChildProvider_Factory(
      MembersInjector<MonthYearNodeChildProvider> monthYearNodeChildProviderMembersInjector) {
    assert monthYearNodeChildProviderMembersInjector != null;
    this.monthYearNodeChildProviderMembersInjector = monthYearNodeChildProviderMembersInjector;
  }

  @Override
  public MonthYearNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        monthYearNodeChildProviderMembersInjector, new MonthYearNodeChildProvider());
  }

  public static Factory<MonthYearNodeChildProvider> create(
      MembersInjector<MonthYearNodeChildProvider> monthYearNodeChildProviderMembersInjector) {
    return new MonthYearNodeChildProvider_Factory(monthYearNodeChildProviderMembersInjector);
  }
}
