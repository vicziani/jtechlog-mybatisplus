package jtechlog.mybatis;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("employees")
@KeySequence("seq_employees")
public class Employee {


    private Long id;

    private String name;

    public Employee(String name) {
        this.name = name;
    }
}
