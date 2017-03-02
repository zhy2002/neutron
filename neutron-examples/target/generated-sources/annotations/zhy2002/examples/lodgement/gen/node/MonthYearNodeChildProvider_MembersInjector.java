package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MonthYearNodeChildProvider_MembersInjector
    implements MembersInjector<MonthYearNodeChildProvider> {
  private final MembersInjector<YearNode> yearNodeInjectorMembersInjector;

  private final MembersInjector<MonthNode> monthNodeInjectorMembersInjector;

  public MonthYearNodeChildProvider_MembersInjector(
      MembersInjector<YearNode> yearNodeInjectorMembersInjector,
      MembersInjector<MonthNode> monthNodeInjectorMembersInjector) {
    assert yearNodeInjectorMembersInjector != null;
    this.yearNodeInjectorMembersInjector = yearNodeInjectorMembersInjector;
    assert monthNodeInjectorMembersInjector != null;
    this.monthNodeInjectorMembersInjector = monthNodeInjectorMembersInjector;
  }

  public static MembersInjector<MonthYearNodeChildProvider> create(
      MembersInjector<YearNode> yearNodeInjectorMembersInjector,
      MembersInjector<MonthNode> monthNodeInjectorMembersInjector) {
    return new MonthYearNodeChildProvider_MembersInjector(
        yearNodeInjectorMembersInjector, monthNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(MonthYearNodeChildProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.yearNodeInjector = yearNodeInjectorMembersInjector;
    instance.monthNodeInjector = monthNodeInjectorMembersInjector;
  }

  public static void injectYearNodeInjector(
      MonthYearNodeChildProvider instance, MembersInjector<YearNode> yearNodeInjector) {
    instance.yearNodeInjector = yearNodeInjector;
  }

  public static void injectMonthNodeInjector(
      MonthYearNodeChildProvider instance, MembersInjector<MonthNode> monthNodeInjector) {
    instance.monthNodeInjector = monthNodeInjector;
  }
}
