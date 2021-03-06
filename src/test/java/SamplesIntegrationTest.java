import org.gradle.samples.test.normalizer.FileSeparatorOutputNormalizer;
import org.gradle.samples.test.normalizer.JavaObjectSerializationOutputNormalizer;
import org.gradle.samples.test.runner.SamplesOutputNormalizers;
import org.junit.runner.RunWith;
import org.gradle.samples.test.runner.GradleSamplesRunner;
import org.gradle.samples.test.runner.SamplesRoot;

@RunWith(GradleSamplesRunner.class)
@SamplesRoot("samples")
@SamplesOutputNormalizers({JavaObjectSerializationOutputNormalizer.class, FileSeparatorOutputNormalizer.class})
public class SamplesIntegrationTest {

}