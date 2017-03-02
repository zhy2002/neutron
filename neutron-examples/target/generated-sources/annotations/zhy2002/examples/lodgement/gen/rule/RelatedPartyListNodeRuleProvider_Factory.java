package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPartyListNodeRuleProvider_Factory
    implements Factory<RelatedPartyListNodeRuleProvider> {
  private final MembersInjector<RelatedPartyListNodeRuleProvider>
      relatedPartyListNodeRuleProviderMembersInjector;

  public RelatedPartyListNodeRuleProvider_Factory(
      MembersInjector<RelatedPartyListNodeRuleProvider>
          relatedPartyListNodeRuleProviderMembersInjector) {
    assert relatedPartyListNodeRuleProviderMembersInjector != null;
    this.relatedPartyListNodeRuleProviderMembersInjector =
        relatedPartyListNodeRuleProviderMembersInjector;
  }

  @Override
  public RelatedPartyListNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        relatedPartyListNodeRuleProviderMembersInjector, new RelatedPartyListNodeRuleProvider());
  }

  public static Factory<RelatedPartyListNodeRuleProvider> create(
      MembersInjector<RelatedPartyListNodeRuleProvider>
          relatedPartyListNodeRuleProviderMembersInjector) {
    return new RelatedPartyListNodeRuleProvider_Factory(
        relatedPartyListNodeRuleProviderMembersInjector);
  }
}
