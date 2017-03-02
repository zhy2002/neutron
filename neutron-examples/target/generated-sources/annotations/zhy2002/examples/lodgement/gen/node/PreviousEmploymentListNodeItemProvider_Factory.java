package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PreviousEmploymentListNodeItemProvider_Factory
    implements Factory<PreviousEmploymentListNodeItemProvider> {
  private final MembersInjector<PreviousEmploymentListNodeItemProvider>
      previousEmploymentListNodeItemProviderMembersInjector;

  public PreviousEmploymentListNodeItemProvider_Factory(
      MembersInjector<PreviousEmploymentListNodeItemProvider>
          previousEmploymentListNodeItemProviderMembersInjector) {
    assert previousEmploymentListNodeItemProviderMembersInjector != null;
    this.previousEmploymentListNodeItemProviderMembersInjector =
        previousEmploymentListNodeItemProviderMembersInjector;
  }

  @Override
  public PreviousEmploymentListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        previousEmploymentListNodeItemProviderMembersInjector,
        new PreviousEmploymentListNodeItemProvider());
  }

  public static Factory<PreviousEmploymentListNodeItemProvider> create(
      MembersInjector<PreviousEmploymentListNodeItemProvider>
          previousEmploymentListNodeItemProviderMembersInjector) {
    return new PreviousEmploymentListNodeItemProvider_Factory(
        previousEmploymentListNodeItemProviderMembersInjector);
  }
}
