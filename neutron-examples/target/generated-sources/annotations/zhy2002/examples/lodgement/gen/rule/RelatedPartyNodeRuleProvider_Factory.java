package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPartyNodeRuleProvider_Factory
    implements Factory<RelatedPartyNodeRuleProvider> {
  private final MembersInjector<RelatedPartyNodeRuleProvider>
      relatedPartyNodeRuleProviderMembersInjector;

  public RelatedPartyNodeRuleProvider_Factory(
      MembersInjector<RelatedPartyNodeRuleProvider> relatedPartyNodeRuleProviderMembersInjector) {
    assert relatedPartyNodeRuleProviderMembersInjector != null;
    this.relatedPartyNodeRuleProviderMembersInjector = relatedPartyNodeRuleProviderMembersInjector;
  }

  @Override
  public RelatedPartyNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        relatedPartyNodeRuleProviderMembersInjector, new RelatedPartyNodeRuleProvider());
  }

  public static Factory<RelatedPartyNodeRuleProvider> create(
      MembersInjector<RelatedPartyNodeRuleProvider> relatedPartyNodeRuleProviderMembersInjector) {
    return new RelatedPartyNodeRuleProvider_Factory(relatedPartyNodeRuleProviderMembersInjector);
  }
}
