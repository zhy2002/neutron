package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AdditionalCommentNodeRuleProvider_Factory
    implements Factory<AdditionalCommentNodeRuleProvider> {
  private final MembersInjector<AdditionalCommentNodeRuleProvider>
      additionalCommentNodeRuleProviderMembersInjector;

  public AdditionalCommentNodeRuleProvider_Factory(
      MembersInjector<AdditionalCommentNodeRuleProvider>
          additionalCommentNodeRuleProviderMembersInjector) {
    assert additionalCommentNodeRuleProviderMembersInjector != null;
    this.additionalCommentNodeRuleProviderMembersInjector =
        additionalCommentNodeRuleProviderMembersInjector;
  }

  @Override
  public AdditionalCommentNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        additionalCommentNodeRuleProviderMembersInjector, new AdditionalCommentNodeRuleProvider());
  }

  public static Factory<AdditionalCommentNodeRuleProvider> create(
      MembersInjector<AdditionalCommentNodeRuleProvider>
          additionalCommentNodeRuleProviderMembersInjector) {
    return new AdditionalCommentNodeRuleProvider_Factory(
        additionalCommentNodeRuleProviderMembersInjector);
  }
}
