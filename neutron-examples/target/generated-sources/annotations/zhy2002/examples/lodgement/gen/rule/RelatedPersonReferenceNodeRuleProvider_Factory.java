package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RelatedPersonReferenceNodeRuleProvider_Factory
    implements Factory<RelatedPersonReferenceNodeRuleProvider> {
  private final MembersInjector<RelatedPersonReferenceNodeRuleProvider>
      relatedPersonReferenceNodeRuleProviderMembersInjector;

  public RelatedPersonReferenceNodeRuleProvider_Factory(
      MembersInjector<RelatedPersonReferenceNodeRuleProvider>
          relatedPersonReferenceNodeRuleProviderMembersInjector) {
    assert relatedPersonReferenceNodeRuleProviderMembersInjector != null;
    this.relatedPersonReferenceNodeRuleProviderMembersInjector =
        relatedPersonReferenceNodeRuleProviderMembersInjector;
  }

  @Override
  public RelatedPersonReferenceNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        relatedPersonReferenceNodeRuleProviderMembersInjector,
        new RelatedPersonReferenceNodeRuleProvider());
  }

  public static Factory<RelatedPersonReferenceNodeRuleProvider> create(
      MembersInjector<RelatedPersonReferenceNodeRuleProvider>
          relatedPersonReferenceNodeRuleProviderMembersInjector) {
    return new RelatedPersonReferenceNodeRuleProvider_Factory(
        relatedPersonReferenceNodeRuleProviderMembersInjector);
  }
}
