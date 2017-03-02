package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetiredEmploymentNodeChildProvider_Factory
    implements Factory<RetiredEmploymentNodeChildProvider> {
  private final MembersInjector<RetiredEmploymentNodeChildProvider>
      retiredEmploymentNodeChildProviderMembersInjector;

  public RetiredEmploymentNodeChildProvider_Factory(
      MembersInjector<RetiredEmploymentNodeChildProvider>
          retiredEmploymentNodeChildProviderMembersInjector) {
    assert retiredEmploymentNodeChildProviderMembersInjector != null;
    this.retiredEmploymentNodeChildProviderMembersInjector =
        retiredEmploymentNodeChildProviderMembersInjector;
  }

  @Override
  public RetiredEmploymentNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        retiredEmploymentNodeChildProviderMembersInjector,
        new RetiredEmploymentNodeChildProvider());
  }

  public static Factory<RetiredEmploymentNodeChildProvider> create(
      MembersInjector<RetiredEmploymentNodeChildProvider>
          retiredEmploymentNodeChildProviderMembersInjector) {
    return new RetiredEmploymentNodeChildProvider_Factory(
        retiredEmploymentNodeChildProviderMembersInjector);
  }
}
