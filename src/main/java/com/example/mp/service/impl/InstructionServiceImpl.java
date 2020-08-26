package com.example.mp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mp.entity.Instruction;
import com.example.mp.mapper.InstructionMapper;
import com.example.mp.service.IInstructionService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lqh
 * @since 2020-08-25
 */
@Service
public class InstructionServiceImpl extends ServiceImpl<InstructionMapper, Instruction> implements IInstructionService {
	
}
