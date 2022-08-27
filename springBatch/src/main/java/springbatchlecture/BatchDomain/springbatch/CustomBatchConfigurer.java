// package springbatchlecture.springbatch;
//
// import javax.sql.DataSource;
//
// import org.springframework.batch.core.repository.JobRepository;
// import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
// import org.springframework.boot.autoconfigure.batch.BasicBatchConfigurer;
// import org.springframework.boot.autoconfigure.batch.BatchProperties;
// import org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers;
// import org.springframework.context.annotation.Configuration;
//
// @Configuration
// public class CustomBatchConfigurer extends BasicBatchConfigurer {
//
//     private final DataSource dataSource;
//
//
//
//     protected CustomBatchConfigurer(BatchProperties properties,
//         DataSource dataSource,
//         TransactionManagerCustomizers transactionManagerCustomizers) {
//         super(properties, dataSource, transactionManagerCustomizers);
//         this.dataSource = dataSource;
//     }
//
//
//     // batch 환경중 jobRepository를 상속받아 커스텀하게 설정할 수 있다.
//     @Override
//     protected JobRepository createJobRepository() throws Exception {
//
//         JobRepositoryFactoryBean factory = new JobRepositoryFactoryBean();
//         factory.setDataSource(dataSource);
//         factory.setTransactionManager(getTransactionManager());
//         factory.setIsolationLevelForCreate("ISOLATION_READ_COMMITTED");
//        // factory.setTablePrefix("SYSTEM_");
//
//         return factory.getObject();
//     }
// }
