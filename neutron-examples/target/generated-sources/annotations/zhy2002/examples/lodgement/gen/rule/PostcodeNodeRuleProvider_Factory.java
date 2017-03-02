package zhy2002.examples.lodgement.gen.rule;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PostcodeNodeRuleProvider_Factory implements Factory<PostcodeNodeRuleProvider> {
  private final MembersInjector<PostcodeNodeRuleProvider> postcodeNodeRuleProviderMembersInjector;

  public PostcodeNodeRuleProvider_Factory(
      MembersInjector<PostcodeNodeRuleProvider> postcodeNodeRuleProviderMembersInjector) {
    assert postcodeNodeRuleProviderMembersInjector != null;
    this.postcodeNodeRuleProviderMembersInjector = postcodeNodeRuleProviderMembersInjector;
  }

  @Override
  public PostcodeNodeRuleProvider get() {
    return MembersInjectors.injectMembers(
        postcodeNodeRuleProviderMembersInjector, new PostcodeNodeRuleProvider());
  }

  public static Factory<PostcodeNodeRuleProvider> create(
      MembersInjector<PostcodeNodeRuleProvider> postcodeNodeRuleProviderMembersInjector) {
    return new PostcodeNodeRuleProvider_Factory(postcodeNodeRuleProviderMembersInjector);
  }
}
