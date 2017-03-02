package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPartyNodeChildProvider_Factory
    implements Factory<RelatedPartyNodeChildProvider> {
  private final MembersInjector<RelatedPartyNodeChildProvider>
      relatedPartyNodeChildProviderMembersInjector;

  public RelatedPartyNodeChildProvider_Factory(
      MembersInjector<RelatedPartyNodeChildProvider> relatedPartyNodeChildProviderMembersInjector) {
    assert relatedPartyNodeChildProviderMembersInjector != null;
    this.relatedPartyNodeChildProviderMembersInjector =
        relatedPartyNodeChildProviderMembersInjector;
  }

  @Override
  public RelatedPartyNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        relatedPartyNodeChildProviderMembersInjector, new RelatedPartyNodeChildProvider());
  }

  public static Factory<RelatedPartyNodeChildProvider> create(
      MembersInjector<RelatedPartyNodeChildProvider> relatedPartyNodeChildProviderMembersInjector) {
    return new RelatedPartyNodeChildProvider_Factory(relatedPartyNodeChildProviderMembersInjector);
  }
}
