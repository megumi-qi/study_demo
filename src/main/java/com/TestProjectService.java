package com;

import com.itheima.config.SpringConfig;
import com.itheima.proxy.ProjectService;
import com.itheima.proxy.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestProjectService {

    @Autowired
    private UserService projectService;

    @Test
    public void testDelete() throws InterruptedException {
        projectService.deleteUser();
    }
}
