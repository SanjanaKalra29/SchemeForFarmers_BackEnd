package com.lti;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
//@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)

class SchemeforfarmersapiApplicationTests {

}
