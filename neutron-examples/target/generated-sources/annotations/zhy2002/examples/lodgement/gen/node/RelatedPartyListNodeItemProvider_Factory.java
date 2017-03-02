package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPartyListNodeItemProvider_Factory
    implements Factory<RelatedPartyListNodeItemProvider> {
  private final MembersInjector<RelatedPartyListNodeItemProvider>
      relatedPartyListNodeItemProviderMembersInjector;

  public RelatedPartyListNodeItemProvider_Factory(
      MembersInjector<RelatedPartyListNodeItemProvider>
          relatedPartyListNodeItemProviderMembersInjector) {
    assert relatedPartyListNodeItemProviderMembersInjector != null;
    this.relatedPartyListNodeItemProviderMembersInjector =
        relatedPartyListNodeItemProviderMembersInjector;
  }

  @Override
  public RelatedPartyListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        relatedPartyListNodeItemProviderMembersInjector, new RelatedPartyListNodeItemProvider());
  }

  public static Factory<RelatedPartyListNodeItemProvider> create(
      MembersInjector<RelatedPartyListNodeItemProvider>
          relatedPartyListNodeItemProviderMembersInjector) {
    return new RelatedPartyListNodeItemProvider_Factory(
        relatedPartyListNodeItemProviderMembersInjector);
  }
}
